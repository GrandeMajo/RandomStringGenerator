# RandomStringGenerator
Java class to get random string of arbitrary lenght

To get random string of 10 chars simply write:

```
RandomStringGenerator.getRandomString(10);
```

If you want to get random string with also special chars (e.g. punctuation chars) write:

```
RandomStringGenerator.getRandomString(10, true);
```

If you need to avoid some chars in the result, for example "<" and ">", write:

```
RandomStringGenerator.getRandomString(10, true, "<>");
```
