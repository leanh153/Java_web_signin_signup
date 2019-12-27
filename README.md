# Java web signin signup


 
## Table of contents

- [Pre-Requisites](#Pre-Requisites)
- [Demo](#Demo)
- [How to run](#How-to-run)
- [What's included](#whats-included)
- [Creators](#creators)

## Pre-Requisites
- [Install JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Install Eclipse IDE](https://www.eclipse.org/downloads/)
- [Install Tomcat server](https://tomcat.apache.org/download-90.cgi)

## Demo
- [Video]()

## How to run

- Copy or move file with .war extension to tomcat webapps folder and start server.

## What's included


```text
Java_web_signin_signup
├── build.sh
├── Javaweb-project3.war
├── README.md
├── src
│   ├── controller
│   │   ├── LoginFilter.java
│   │   └── LoginProcess.java
│   ├── entity
│   │   ├── Message.java
│   │   └── User.java
│   └── util
│       └── UsersService.java
└── WebContent
    ├── error.jsp
    ├── index.jsp
    ├── login.jsp
    ├── META-INF
    │   └── MANIFEST.MF
    ├── navibar.jsp
    ├── node_modules
    │   ├── bootstrap
    │   │   ├── dist
    │   │   │   ├── css
    │   │   │   │   ├── bootstrap.css
    │   │   │   │   ├── bootstrap.css.map
    │   │   │   │   ├── bootstrap-grid.css
    │   │   │   │   ├── bootstrap-grid.css.map
    │   │   │   │   ├── bootstrap-grid.min.css
    │   │   │   │   ├── bootstrap-grid.min.css.map
    │   │   │   │   ├── bootstrap.min.css
    │   │   │   │   ├── bootstrap.min.css.map
    │   │   │   │   ├── bootstrap-reboot.css
    │   │   │   │   ├── bootstrap-reboot.css.map
    │   │   │   │   ├── bootstrap-reboot.min.css
    │   │   │   │   └── bootstrap-reboot.min.css.map
    │   │   │   └── js
    │   │   │       ├── bootstrap.bundle.js
    │   │   │       ├── bootstrap.bundle.js.map
    │   │   │       ├── bootstrap.bundle.min.js
    │   │   │       ├── bootstrap.bundle.min.js.map
    │   │   │       ├── bootstrap.js
    │   │   │       ├── bootstrap.js.map
    │   │   │       ├── bootstrap.min.js
    │   │   │       └── bootstrap.min.js.map
    │   │   ├── LICENSE
    │   │   ├── package.json
    │   │   ├── README.md
    │   │   └── scss
    │   │       ├── _alert.scss
    │   │       ├── _badge.scss
    │   │       ├── bootstrap-grid.scss
    │   │       ├── bootstrap-reboot.scss
    │   │       ├── bootstrap.scss
    │   │       ├── _breadcrumb.scss
    │   │       ├── _button-group.scss
    │   │       ├── _buttons.scss
    │   │       ├── _card.scss
    │   │       ├── _carousel.scss
    │   │       ├── _close.scss
    │   │       ├── _code.scss
    │   │       ├── _custom-forms.scss
    │   │       ├── _dropdown.scss
    │   │       ├── _forms.scss
    │   │       ├── _functions.scss
    │   │       ├── _grid.scss
    │   │       ├── _images.scss
    │   │       ├── _input-group.scss
    │   │       ├── _jumbotron.scss
    │   │       ├── _list-group.scss
    │   │       ├── _media.scss
    │   │       ├── mixins
    │   │       │   ├── _alert.scss
    │   │       │   ├── _background-variant.scss
    │   │       │   ├── _badge.scss
    │   │       │   ├── _border-radius.scss
    │   │       │   ├── _box-shadow.scss
    │   │       │   ├── _breakpoints.scss
    │   │       │   ├── _buttons.scss
    │   │       │   ├── _caret.scss
    │   │       │   ├── _clearfix.scss
    │   │       │   ├── _float.scss
    │   │       │   ├── _forms.scss
    │   │       │   ├── _gradients.scss
    │   │       │   ├── _grid-framework.scss
    │   │       │   ├── _grid.scss
    │   │       │   ├── _hover.scss
    │   │       │   ├── _image.scss
    │   │       │   ├── _list-group.scss
    │   │       │   ├── _lists.scss
    │   │       │   ├── _navbar-align.scss
    │   │       │   ├── _nav-divider.scss
    │   │       │   ├── _pagination.scss
    │   │       │   ├── _reset-text.scss
    │   │       │   ├── _resize.scss
    │   │       │   ├── _screen-reader.scss
    │   │       │   ├── _size.scss
    │   │       │   ├── _table-row.scss
    │   │       │   ├── _text-emphasis.scss
    │   │       │   ├── _text-hide.scss
    │   │       │   ├── _text-truncate.scss
    │   │       │   ├── _transition.scss
    │   │       │   └── _visibility.scss
    │   │       ├── _mixins.scss
    │   │       ├── _modal.scss
    │   │       ├── _navbar.scss
    │   │       ├── _nav.scss
    │   │       ├── _pagination.scss
    │   │       ├── _popover.scss
    │   │       ├── _print.scss
    │   │       ├── _progress.scss
    │   │       ├── _reboot.scss
    │   │       ├── _root.scss
    │   │       ├── _tables.scss
    │   │       ├── _tooltip.scss
    │   │       ├── _transitions.scss
    │   │       ├── _type.scss
    │   │       ├── utilities
    │   │       │   ├── _align.scss
    │   │       │   ├── _background.scss
    │   │       │   ├── _borders.scss
    │   │       │   ├── _clearfix.scss
    │   │       │   ├── _display.scss
    │   │       │   ├── _embed.scss
    │   │       │   ├── _flex.scss
    │   │       │   ├── _float.scss
    │   │       │   ├── _position.scss
    │   │       │   ├── _screenreaders.scss
    │   │       │   ├── _sizing.scss
    │   │       │   ├── _spacing.scss
    │   │       │   ├── _text.scss
    │   │       │   └── _visibility.scss
    │   │       ├── _utilities.scss
    │   │       └── _variables.scss
    │   ├── jquery
    │   │   ├── AUTHORS.txt
    │   │   ├── bower.json
    │   │   ├── dist
    │   │   │   ├── core.js
    │   │   │   ├── jquery.js
    │   │   │   ├── jquery.min.js
    │   │   │   ├── jquery.min.map
    │   │   │   ├── jquery.slim.js
    │   │   │   ├── jquery.slim.min.js
    │   │   │   └── jquery.slim.min.map
    │   │   ├── external
    │   │   │   └── sizzle
    │   │   │       ├── dist
    │   │   │       │   ├── sizzle.js
    │   │   │       │   ├── sizzle.min.js
    │   │   │       │   └── sizzle.min.map
    │   │   │       └── LICENSE.txt
    │   │   ├── LICENSE.txt
    │   │   ├── package.json
    │   │   ├── README.md
    │   │   └── src
    │   │       ├── ajax
    │   │       │   ├── jsonp.js
    │   │       │   ├── load.js
    │   │       │   ├── parseXML.js
    │   │       │   ├── script.js
    │   │       │   ├── var
    │   │       │   │   ├── location.js
    │   │       │   │   ├── nonce.js
    │   │       │   │   └── rquery.js
    │   │       │   └── xhr.js
    │   │       ├── ajax.js
    │   │       ├── attributes
    │   │       │   ├── attr.js
    │   │       │   ├── classes.js
    │   │       │   ├── prop.js
    │   │       │   ├── support.js
    │   │       │   └── val.js
    │   │       ├── attributes.js
    │   │       ├── callbacks.js
    │   │       ├── core
    │   │       │   ├── access.js
    │   │       │   ├── DOMEval.js
    │   │       │   ├── init.js
    │   │       │   ├── nodeName.js
    │   │       │   ├── parseHTML.js
    │   │       │   ├── readyException.js
    │   │       │   ├── ready.js
    │   │       │   ├── ready-no-deferred.js
    │   │       │   ├── stripAndCollapse.js
    │   │       │   ├── support.js
    │   │       │   └── var
    │   │       │       └── rsingleTag.js
    │   │       ├── core.js
    │   │       ├── css
    │   │       │   ├── addGetHookIf.js
    │   │       │   ├── adjustCSS.js
    │   │       │   ├── curCSS.js
    │   │       │   ├── hiddenVisibleSelectors.js
    │   │       │   ├── showHide.js
    │   │       │   ├── support.js
    │   │       │   └── var
    │   │       │       ├── cssExpand.js
    │   │       │       ├── getStyles.js
    │   │       │       ├── isHiddenWithinTree.js
    │   │       │       ├── rmargin.js
    │   │       │       ├── rnumnonpx.js
    │   │       │       └── swap.js
    │   │       ├── css.js
    │   │       ├── data
    │   │       │   ├── Data.js
    │   │       │   └── var
    │   │       │       ├── acceptData.js
    │   │       │       ├── dataPriv.js
    │   │       │       └── dataUser.js
    │   │       ├── data.js
    │   │       ├── deferred
    │   │       │   └── exceptionHook.js
    │   │       ├── deferred.js
    │   │       ├── deprecated.js
    │   │       ├── dimensions.js
    │   │       ├── effects
    │   │       │   ├── animatedSelector.js
    │   │       │   └── Tween.js
    │   │       ├── effects.js
    │   │       ├── event
    │   │       │   ├── ajax.js
    │   │       │   ├── alias.js
    │   │       │   ├── focusin.js
    │   │       │   ├── support.js
    │   │       │   └── trigger.js
    │   │       ├── event.js
    │   │       ├── exports
    │   │       │   ├── amd.js
    │   │       │   └── global.js
    │   │       ├── jquery.js
    │   │       ├── manipulation
    │   │       │   ├── buildFragment.js
    │   │       │   ├── _evalUrl.js
    │   │       │   ├── getAll.js
    │   │       │   ├── setGlobalEval.js
    │   │       │   ├── support.js
    │   │       │   ├── var
    │   │       │   │   ├── rcheckableType.js
    │   │       │   │   ├── rscriptType.js
    │   │       │   │   └── rtagName.js
    │   │       │   └── wrapMap.js
    │   │       ├── manipulation.js
    │   │       ├── offset.js
    │   │       ├── queue
    │   │       │   └── delay.js
    │   │       ├── queue.js
    │   │       ├── selector.js
    │   │       ├── selector-native.js
    │   │       ├── selector-sizzle.js
    │   │       ├── serialize.js
    │   │       ├── traversing
    │   │       │   ├── findFilter.js
    │   │       │   └── var
    │   │       │       ├── dir.js
    │   │       │       ├── rneedsContext.js
    │   │       │       └── siblings.js
    │   │       ├── traversing.js
    │   │       ├── var
    │   │       │   ├── arr.js
    │   │       │   ├── class2type.js
    │   │       │   ├── concat.js
    │   │       │   ├── documentElement.js
    │   │       │   ├── document.js
    │   │       │   ├── fnToString.js
    │   │       │   ├── getProto.js
    │   │       │   ├── hasOwn.js
    │   │       │   ├── indexOf.js
    │   │       │   ├── ObjectFunctionString.js
    │   │       │   ├── pnum.js
    │   │       │   ├── push.js
    │   │       │   ├── rcssNum.js
    │   │       │   ├── rnothtmlwhite.js
    │   │       │   ├── slice.js
    │   │       │   ├── support.js
    │   │       │   └── toString.js
    │   │       └── wrap.js
    │   └── popper.js
    │       ├── dist
    │       │   ├── esm
    │       │   │   ├── popper.js
    │       │   │   ├── popper.js.map
    │       │   │   ├── popper.min.js
    │       │   │   ├── popper.min.js.map
    │       │   │   ├── popper-utils.js
    │       │   │   ├── popper-utils.js.map
    │       │   │   ├── popper-utils.min.js
    │       │   │   └── popper-utils.min.js.map
    │       │   ├── popper.js
    │       │   ├── popper.js.map
    │       │   ├── popper.min.js
    │       │   ├── popper.min.js.map
    │       │   ├── popper-utils.js
    │       │   ├── popper-utils.js.map
    │       │   ├── popper-utils.min.js
    │       │   ├── popper-utils.min.js.map
    │       │   └── umd
    │       │       ├── popper.js
    │       │       ├── popper.js.map
    │       │       ├── popper.min.js
    │       │       ├── popper.min.js.map
    │       │       ├── popper-utils.js
    │       │       ├── popper-utils.js.map
    │       │       ├── popper-utils.min.js
    │       │       └── popper-utils.min.js.map
    │       ├── index.d.ts
    │       ├── package.json
    │       └── README.md
    ├── package.json
    ├── profile.jsp
    ├── sign-up.jsp
    ├── userCounter.jsp
    ├── WEB-INF
    │   ├── lib
    │   └── web.xml
    ├── welcome.jsp
    └── yarn.lock

45 directories, 271 files
```
## Creators

- [Github](https://github.com/leanh153)

- Make friend [FACEBOOK](https://WWW.facebook.com/leanh153)

- My [LinkIn](https://www.linkedin.com/in/lênanh)

Enjoy :metal:
