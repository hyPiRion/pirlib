# pirlib

A Leiningen template for hyPiRion's preferred default settings. This project
is very stable, and changes shouldn't modify the library setup too much.
Whenever a new project is made with this template, it will use the latest
release, which has the features mentioned in this README.

## Usage

With Leiningen 2.0 or higher, simply say

```shell
$ lein new pirlib name-of-new-project :username your-username
```

and you have a Clojure library setup which hyPiRion prefer to use.

## "Features"

This template consist of the following:

* A `LICENSE` file, with the Eclipse Public License, version 1.0 contained
  within it.
* A `CONTRIBUTING.md` file, with a lot of details about how one should do a
  proper pull request, what codestyle one should use, as well as how one should
  file an issue (properly).
* A `CHANGES.md` file, which is a changelog-file and can be used as a TODO-file
  for specific versions.
* A `README.md` file, which mainly contain a TODO list of things you should fill
  in within the README before deploying the first version. It also contains
  License information along with both a hyperlink and a reference to the
  `LICENSE` file.
* A `.gitignore` file, including common backup files like emacs backup files and
  vim swap files.
* A `.travis.yml` file, for a very standard Clojure Travis-CI setup.
* An empty `main.clj` file and an empty `test/main.clj` file, with only their
  namespaces declarations inside.

And it assumes

* That you use the following tools/services:
  * Leiningen—duh, obviously
  * Git to version control your code
  * Github, for handling issues, pull requests and storage
  * *(Optional)* Travis-CI, for continuous integration
* That you would like to use the Eclipse Public License, version 1.0 as license
  for your code.
* That you encourage people to do pull request on Github, and that you prefer to
  have them in a (relatively) standard and common format.
* That you would only deploy from the git branch named `stable`.

## "Non"-features

First of all, when I say "non"-features, I mean features that is generally
sensible to include to make it easier and better to both use and contribute to
the library you're creating, but is **not** covered by this template.

### Documentation

What I usually prefer to do, is to put documentation in the `gh-pages` branch
and let [Codox][] do the generation of online documentation. *I keep
documentation for all versions online,* and let e.g. `0.1.0` documentation lay
within a `0.1.0/` folder which is linked to by the main `index.html` file.

This is usually fine for smaller libraries, but for larger libraries, one should
create literal documentation, explaining *how* to use the libary, common idioms
and possible pitfalls/FAQ. For libraries where you would want active
contribution, you should write a text which explains how the code works
internally, preferably with figures and example code if it makes sense.

It goes without saying that writing documentation is hard, and is something the
programming world, Clojure in particular, should focus a lot more on. Yes, it is
sometimes boring, but increasing the bus factor is something which can only make
software better, easier to use, and, perhaps most importantly, give valuable
insights in how one can improve or enhance the software at hand.

[codox]: https://www.github.com/weavejester/codox "Codox, by Weavejester."

## License

Copyright © 2013 Jean Niklas L'orange

This work is distributed under a
[Creative Commons Attribution-ShareAlike 3.0 Unported License][license]. You can
find a copy in the root of this repository with the name `LICENSE`. All files
this Leiningen template generates is in the public domain.

[license]: hhttp://creativecommons.org/licenses/by-sa/3.0/
