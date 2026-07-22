# SVG Bootstrap

A collection of all [Bootstrap](https://icons.getbootstrap.com) SVG icon paths as Java enum constants – ready to be used in any Java program.

![Bootstrap](https://github.com/Maran23/svgnode/blob/demo/demo/library_bootstrap.webp)

## Features

- 🎨 All Bootstrap icons as Java enums
- 🔗 No dependencies
- 📐 Designed as a companion library for [SvgNode](https://github.com/Maran23/svgnode) for use in JavaFX applications – but works in any Java context

## Installation

### Requirements

| Dependency | Version |
|------------|---------|
| Java       | 25+     |

### Maven

```xml
<dependency>
    <groupId>tools.maran</groupId>
    <artifactId>svg-bootstrap</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```groovy
implementation 'tools.maran:svg-bootstrap:1.0.0'
```

## Usage

### Pure Java

```java
import tools.maran.svg.bootstrap.Bootstrap;

String path = Bootstrap.HOUSE.path();
```

#### With the SVG type

```java
import tools.maran.svg.SVG;
import tools.maran.svg.bootstrap.Bootstrap;

SVG svg = Bootstrap.HOUSE;
```

### Usage with [SvgNode](https://github.com/Maran23/svgnode)

#### Java

```java
import tools.maran.svgnode.SvgNode;
import tools.maran.svg.bootstrap.Bootstrap;

SvgNode node = new SvgNode(Bootstrap.HOUSE, 32);
```
#### FXML

```xml
<?import tools.maran.svgnode.SvgNode?>
<?import tools.maran.svg.bootstrap.Bootstrap?>

<SvgNode size="32" color="RED">
    <path>
        <Bootstrap fx:constant="HOUSE"/>
    </path>
</SvgNode>
```

## Acknowledgements

This project includes SVG icon data from [Bootstrap](https://icons.getbootstrap.com),
licensed under [MIT License](https://github.com/twbs/icons/blob/main/LICENSE).
