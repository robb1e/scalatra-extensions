# Scalatra Extensions

This is a small project with utilities that I find I write for every project I've used Scalatra on.  

## ProductToJsonSupport trait

When this trait is included, any Product (i.e. case) class will automatically get converted into JSON through the Liftweb JSON library.  This has been useful for API web applications, keeping the servlet's clean and returning only a Product class without having to worry about serialisation within the class.

## SspScalatraKernel trait

This trait forces a convention of where to put the Scalate (and in this case SSP) files in your WEB-INF folder. It also allows HTTP response settings to be set as parameters into this render method, so that the servlet doesn't have to mutate the response object, but can pass the settings it wants to apply. This has been useful for me when dealing with different response types and caching times.

# Using

If using SBT, add these resolvers to your project: 

  "robb1e Github Releases" at "http://robb1e.github.com/maven/repo-releases"
  "robb1e Github Snapshots" at "http://robb1e.github.com/maven/repo-snapshots"

Include this as a dependency

    "org.scalatra" %% "extensions" % "0.1-SNAPSHOT"

And away you go.

# Publishing

This is published via my personal Git repo, feel free to send me a pull request of any other utilities you'd like included.

# Thanks

This and other useful snippets have largely been from the work colleges and I have done at [the Guardian](http://www.guardian.co.uk).