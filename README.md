# What is this?

This is a repository containing cool functions for use with other Java programs.

Current version: `1.0.0C`

# Usage

## Mavin

Add these to `pom.xml` > `project`:

```xml
<repositories>
    <repository>
        <id>localpkg</id>
        <url>https://maven.pkg.github.com/Calebh101/localpkg-java</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.calebh101</groupId>
        <artifactId>localpkg</artifactId>
        <version>version</version> <!-- Replace [version] with the current version -->
    </dependency>
</dependencies>
```

# Build and Deploy

- To build: `mvn package -Ppackage`
- To deploy: `mvn deploy -Ppackage`

# Changelog

## 1.0.0A - 7/22/25

- Initial release

## 1.0.0B - 7/22/25

## 1.0.0C - 7/22/25