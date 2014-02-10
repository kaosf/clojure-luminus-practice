# Luminus Practice

## Running

To start a web server for the application, run:

```sh
lein ring server-headless
# or
#lein ring server # open browser
```

## Deploy to Heroku

Nothing to do!

```sh
heorku create:app <appname>
git push heroku master
```

### A part of logs on deployment

```
...
-----> Clojure (Leiningen 2) app detected
-----> Installing OpenJDK 1.6...done
-----> Installing Leiningen
       Downloading: leiningen-2.3.4-standalone.jar
       Writing: lein script
...
```

## References

* [Luminus - A Clojure Web Framework](http://www.luminusweb.net)
* [おいしい Clojure 入門 初版](http://gihyo.jp/book/2013/978-4-7741-5991-1)

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright 2014 ka
