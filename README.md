# meta-patito

Yocto layer for Pocky Dunfell. This layer contains packages that their sole use
is to troll or have fun.

I really doubt you will be using this packages in a serious project, but use
them as a reference to build other packages and layers.


## recipes-extended

You will find inside `recipes-extended/perl` the following recipes (.bb files):

* perl-module-tabs
* ssperl-module-exporter

These are not required to build this layer but are provided as recipe examples.
They were initially created because I didn't know how to enable the builtin
perl packages coming with the Pocky's Perl recipe. Then I learned you need to
append the `PACKAGES` variable of the recipe as done in the `perl_*.bbappend`
file.

## recipes-useless

The provided recipes are:

* sl: A train animation that will make you stop miswritting the `ls` command.
* cowsay: A nice CLI cow (and others) to print messages.

### Images

You will find a recipe for an image called `useless-core-image` which includes
all the mentioned packages. It is based on the Poky core-image so it will boot
and include a nice train and cow inside :D

## Why 'patito'?

`Patito` is the Spanish diminutive for `duck` and its a way some latin american
countries call something that is not very important or its done in a fast and
simple way. It also can be used to refer to something cheap or low quality.
