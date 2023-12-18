Feature: 24hour Weather Forecast
  As a person who wants a weather forecast
  In order to get a forecast for 24hours
  so that I have a 24hour forecast

  Background:
    Given WeatherApplication is running
    And a mock OpenWeatherMap is running

  Scenario: A single 3 hour forecast is retrieved for London
    Given OpenWeatherMap '/data/2.5/forecast?q=London&cnt=1&appid=a8c175a2dc5eb26cafac24d99b2878c7&units=metrics' returns the correct data for a 1 group set

    When I send a get request to '/getLocationWeather' with the params
    """
    {
      "location": "London",
      "hours": 3
    }
    """

    Then the response is status 200

    And the response body is
    """
    {
      "location": {
       "location": "London",
       "lon": -0.1257,
       "lat": 51.5085
      },
      "timeWindows": [
          {
          "generalDetails": {
            "temp": 10.06,
            "feelsLike": 9.26,
            "humidity": 82,
            "pressure": 1031
          },
          "weatherDetails": [{
            "predominatingWeather": "Clouds",
            "description": "broken clouds"
          }],
          "windDetails": {
            "windSpeedAvg": 5.15,
            "direction": 232,
            "maxGust": 13.56
          },
          "cloudDetails": {
            "cloud": 75
          },
          "precipitationDetails": {
            "rain": 0,
            "snow": 0
          }
        }
      ]
    }
    """

  Scenario: A single 3 hour forecast is retrieved for London even if hours is 1
    Given OpenWeatherMap '/data/2.5/forecast?q=London&cnt=1&appid=a8c175a2dc5eb26cafac24d99b2878c7&units=metrics' returns the correct data for a 1 group set

    When I send a get request to '/getLocationWeather' with the params
    """
    {
      "location": "London",
      "hours": 1
    }
    """

    Then the response is status 200

    And the response body is
    """
    {
      "location": {
       "location": "London",
       "lon": -0.1257,
       "lat": 51.5085
      },
      "timeWindows": [
          {
          "generalDetails": {
            "temp": 10.06,
            "feelsLike": 9.26,
            "humidity": 82,
            "pressure": 1031
          },
          "weatherDetails": [{
            "predominatingWeather": "Clouds",
            "description": "broken clouds"
          }],
          "windDetails": {
            "windSpeedAvg": 5.15,
            "direction": 232,
            "maxGust": 13.56
          },
          "cloudDetails": {
            "cloud": 75
          },
          "precipitationDetails": {
            "rain": 0,
            "snow": 0
          }
        }
      ]
    }
    """

  Scenario: A 24 hour forecast is retrieved for Paris
    Given OpenWeatherMap '/data/2.5/forecast?q=Paris&cnt=8&appid=a8c175a2dc5eb26cafac24d99b2878c7&units=metrics' returns the correct data for a 8 group set

    When I send a get request to '/getLocationWeather' with the params
    """
    {
      "location": "Paris",
      "hours": 24
    }
    """

    Then the response is status 200

    And the response body is
    """
    {
       "timeWindows":[
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clouds",
                   "description":"overcast clouds"
                }
             ],
             "windDetails":{
                "maxGust":2.94,
                "windSpeedAvg":1.88,
                "direction":206
             },
             "cloudDetails":{
                "cloud":100
             },
             "generalDetails":{
                "feelsLike":1.8,
                "temp":3.54,
                "humidity":95,
                "pressure":1036
             }
          },
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clouds",
                   "description":"broken clouds"
                }
             ],
             "windDetails":{
                "maxGust":3.4,
                "windSpeedAvg":1.89,
                "direction":211
             },
             "cloudDetails":{
                "cloud":67
             },
             "generalDetails":{
                "feelsLike":2.45,
                "temp":4.11,
                "humidity":87,
                "pressure":1036
             }
          },
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clouds",
                   "description":"scattered clouds"
                }
             ],
             "windDetails":{
                "maxGust":2.5,
                "windSpeedAvg":1.74,
                "direction":211
             },
             "cloudDetails":{
                "cloud":33
             },
             "generalDetails":{
                "feelsLike":2.89,
                "temp":4.34,
                "humidity":79,
                "pressure":1035
             }
          },
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clear",
                   "description":"clear sky"
                }
             ],
             "windDetails":{
                "maxGust":4.58,
                "windSpeedAvg":1.9,
                "direction":207
             },
             "cloudDetails":{
                "cloud":0
             },
             "generalDetails":{
                "feelsLike":3.59,
                "temp":5.1,
                "humidity":69,
                "pressure":1036
             }
          },
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clear",
                   "description":"clear sky"
                }
             ],
             "windDetails":{
                "maxGust":5.61,
                "windSpeedAvg":2.83,
                "direction":218
             },
             "cloudDetails":{
                "cloud":0
             },
             "generalDetails":{
                "feelsLike":6.59,
                "temp":8.31,
                "humidity":56,
                "pressure":1034
             }
          },
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clear",
                   "description":"clear sky"
                }
             ],
             "windDetails":{
                "maxGust":5.49,
                "windSpeedAvg":2.21,
                "direction":224
             },
             "cloudDetails":{
                "cloud":1
             },
             "generalDetails":{
                "feelsLike":7.14,
                "temp":8.39,
                "humidity":58,
                "pressure":1033
             }
          },
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clouds",
                   "description":"scattered clouds"
                }
             ],
             "windDetails":{
                "maxGust":6.4,
                "windSpeedAvg":2.28,
                "direction":235
             },
             "cloudDetails":{
                "cloud":38
             },
             "generalDetails":{
                "feelsLike":4.65,
                "temp":6.32,
                "humidity":67,
                "pressure":1033
             }
          },
          {
             "precipitationDetails":{
                "rain":0,
                "snow":0
             },
             "weatherDetails":[
                {
                   "predominatingWeather":"Clouds",
                   "description":"overcast clouds"
                }
             ],
             "windDetails":{
                "maxGust":5.94,
                "windSpeedAvg":2.22,
                "direction":222
             },
             "cloudDetails":{
                "cloud":92
             },
             "generalDetails":{
                "feelsLike":3.43,
                "temp":5.24,
                "humidity":70,
                "pressure":1033
             }
          }
       ],
       "location":{
          "location":"Paris",
          "lon":2.3488,
          "lat":48.8534
       }
    }
    """