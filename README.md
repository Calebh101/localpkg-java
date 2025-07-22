# What is this?

This is a repository containing cool functions for use with other Java programs.

Current version: `1.0.0B`

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
        <version><!-- Current version --></version>
    </dependency>
</dependencies>
```