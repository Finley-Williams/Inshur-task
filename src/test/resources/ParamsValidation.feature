Feature: 24hour Weather Forecast
  As a person who wants a weather forecast
  In order to stop me throwing junking to the params
  so that I don't break the forecast app

  Background:
    Given WeatherApplication is running
    And a mock OpenWeatherMap is running

  Scenario: A single 3 hour forecast is retrieved for a junk location/invalid location
    Given OpenWeatherMap '/data/2.5/forecast?q=436483234r2&cnt=1&appid=a8c175a2dc5eb26cafac24d99b2878c7&units=metrics' returns the correct data for gibberish location
    """
    {
      "cod": "404",
      "message": "city not found"
    }
    """

    When I send a get request to '/getLocationWeather' with the params
    """
    {
      "location": 436483234r2,
      "hours": 3
    }
    """

    Then the response is status 404

    And the response body is
    """
    {
      "message": "city not found"
    }
    """

  Scenario: A single 3 hour forecast is retrieved for a junk location/invalid count
    Given OpenWeatherMap '/data/2.5/forecast?q=London&cnt=egahjiaqef&appid=a8c175a2dc5eb26cafac24d99b2878c7&units=metrics' returns the correct data for gibberish count
    """
    {
      "cod": "400",
      "message": "egahjiaqef is not a number"
    }
    """

    When I send a get request to '/getLocationWeather' with the params
    """
    {
      "location": "Paris",
      "hours": egahjiaqef
    }
    """

    Then the response is status 400

    And the response body is
    """
    {
      "message": "egahjiaqef is not a number"
    }
    """