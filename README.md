##What I did

I wrote application that tells you a basic forecast and relevant information for next X hours that you ask for broken down into 3 hour chunks rounding up as per the openApi.

##How to run

Right click > run the main method in WeatherApplication.class. You should see a javalin graphic and some text saying javalin has started.

Send a get request to http://localhost:5000/getLocationWeather with the params such as below:

{
  "location": "London",
  "hours": 3
}

Any city is supported and any amount of hours rounded up to the nearest 3. 4 becomes 6 etc...

It should do basic error handling and not topple over if you ask for the weather in "52456jasdhfijasdj" and other such cases.

##Running tests.

To run the test locally right click > run on the feature header in the test resources feature files.

**if they fail after running due to locked ports makes sure that the glue is set correctly so that the server is correctly restarted by the hooks. Do this by clicking on the feature configuration and entering the glue below. In classic fashion I've verfied it works locally but I can't send my configurations so hopefully this does it for you.**

![img.png](img.png)

**org.finley.inshur.steps org.finley.inshur.hooks**

##Two feature files.

Params Validation for error handling.

WeatherSummary for the actual Api itself.

##Thoughts

I tried to use the hexagon architecture concept in the sense you could swap out the open weather repository for anything else that returns a "forecast" object and it should still work, though I'm not entirely confident implemented it in the correct way? Maybe I need a port/adapter class? Not really sure of the naming structure. In theory, you could also swap out the request, but I've not nearly made that so generic though I could if I had time.

DDD wise I tried to keep the weather domain as DDD as possible though I've definitely strayed into typical software engineer naming schemes. I suspect I don't correctly understand the concept to implement it correctly. I'm sure I could but not within the constraints and my relative lack of experiance with it.

Given the lack of direction in the prompt I found it very difficult to know what to do, hence the hours to count service and various extra added to make it not just a service that just repeats what it  was told by open weather.


##To do if I had more time?
  
Hide the api key, obviously not hugely important for this... But not good practice to leave it in plain text....

Lean less on OpenWeatherApi for validation, its great that is there since it makes my life easy with the city name validator but if I could precheck them before hitting the api that would be ideal for performance (if this were a system where this mattered)

If I'd had more time and been more adventurous I would have done this in Springboot as I know this is what you use, but I played it safe and used what I know so I guess implement in springboot to better fit your stack? (on the assumption this would have to be maintained, and the like if it were real)

Write some unit tests and subsequent validation for the most extreme case. I feel like I've pretty comprehensively covered the behaviour I intended with BDD but you could 100% break this if you tried.