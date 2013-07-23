# Contributing

There's not much to contribute to within Pirlib, to be honest. If you want to
change something which alters the actual setup (say, changing the license or to
remove travis-ci or stuff like that), you're better off making a clone of this
library, modify the changes and make your own template (or put forward a good
argument for why I should change it). If there are minor errors in the template,
I'd love to get those fixed.

Patches are preferred as Github pull requests. Use topic branches instead of
commiting directly to master, to avoid unnecessary merge hassle. It is preferred
that commit messages keeps the following style:

* First line is 50 characters or less
* Then a blank line
* Remaining text should be wrapped at 72 characters

As an example, this would be preferable:

```shell
# Fork the project off Github
$ git clone git@github.com:your-username-here/pirlib.git
$ cd pirlib
$ git checkout -b my-patch
# Do your changes now, and stage them
$ lein test
$ git commit -m "I've fixed this and that"
$ git push
# Submit a pull request
```

## Code style

Try to be aware of the conventions in the existing code. Make a reasonable
attempt to avoid lines longer than 80 columns or function bodies longer than 20
lines. Don't use `when` unless it's for side-effects.

## Testing

Before you're asking for a pull request, we would be very happy if you ensure
that the changes you've done doesn't break any of the existing test cases.
Patches which add test coverage for the functionality they change are especially
welcome, but this is not necessary.

To run the test cases, run `lein test` in the root directory.
