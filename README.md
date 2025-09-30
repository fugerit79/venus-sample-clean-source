# venus-sample-clean-source

Venus Fugerit Doc sample showing ability to clean source XML.

This is a sample project configured using [fj-doc-maven-plugin init plugin](https://venusdocs.fugerit.org/guide/#maven-plugin-goal-init).

Creation command :

```shell
mvn org.fugerit.java:fj-doc-maven-plugin:8.16.5:init \
-DgroupId=org.fugerit.java.demo \
-DartifactId=venus-sample-clean-source \
-Dextensions=base,freemarker \
-Dflavour=vanilla
```

## Add XML source cleaning

Sometimes, when parsing XML, you can get some errors like : 

```txt
org.xml.sax.SAXParseException; lineNumber: 50; columnNumber: 25; An invalid XML character (Unicode: 0x2) was found in the element content of the document.
```

As stated in [XML specification](https://www.w3.org/TR/xml/#charsets) some Unicode characters are discouraged.

Venus Fugerit Doc has built-in to remove unsupported XML characters.

If activated, all characters matching the default regex are removed : 

```txt
"[^\\u0009\\u000A\\u000D\\u0020-\\uD7FF\\uE000-\\uFFFD\\u10000-\\u10FFF]+"
```

This can be achieved by setting [cleanSource](https://venusdocs.fugerit.org/guide/#doc-freemarker-config) property to true in the [freemarker-doc-process-config](src/main/resources/venus-sample-clean-source/fm-doc-process-config.xml) file.

```xml
<freemarker-doc-process-config
        xmlns="https://freemarkerdocprocess.fugerit.org"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="https://freemarkerdocprocess.fugerit.org https://www.fugerit.org/data/java/doc/xsd/freemarker-doc-process-1-0.xsd"
        cleanSource="true">
```

Here is a [sample document](src/main/resources/venus-sample-clean-source/template/document.ftl) containing a few unwanted characters.