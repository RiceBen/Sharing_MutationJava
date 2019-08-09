# Sharing Mutation in Java

## Package Installed

- junit [official site](https://junit.org/junit4/)
- org.pitest [official site](http://pitest.org/)

## How To Run

- mvn compile
- mvn test
- mvn org.pitest:pitest-maven:mutationCoverage

### Mutation Report

You will find report at {project dir}\target\pit-reports

## What's mutation test

[Wiki](https://en.wikipedia.org/wiki/Mutation_testing)

Mutation test is a way to test your unit test and production code is good enough or not.

## Mutators PIT provide

examples and description below can find in ref link.

[ref](http://pitest.org/quickstart/mutators/)

### Default group

- Conditionals Boundary Mutator

> mutate operators `<, <=, >, >=`
>
> ex:
>
```java
 if (a > b) {
  System.out.println("a is bigger than b");
}
```

> will be mutate to

```java
if (a >= b) {
  System.out.println("a is bigger than b");
}
```

- Increments Mutor

> only mutate local veriables

```java
public int Increment(int i) {
  i++;
  return i;
}
```

> will be mutate to

```java
public int Increment(int i) {
  i--;
  return i;
}
```

- Invert Negatives Mutor

> inverts negation of integer and floating point numbers

```java
public float negate(final float i) {
  return -i;
}
```

> will be mutate to

```java
public float negate(final float i) {
  return i;
}
```

- Math Mutor

> replaces binary arithmetic operations for either integer or floating-point arithmetic with another operation

```java
double num3 = num1 + num2;
```

> will be mutate to

```java
double num3 = num1 - num2;
```

- Negate Conditionals Mutor

> mutate conditionals

```java
if (a == b) {
  System.out.println("a is equal to b");
}
```

> will be mutate to

```java
if (a != b) {
  System.out.println("a is equal to b");
}
```

- Return Values Mutator

> mutates the return values of method calls
>
> _different from return type, if value type then change to default or opposite value, if reference type then return null, if return null then throw java.lang.RuntimeException_

```java
public Object foo() {
  return new Object();
}
```

> will be mutate to

```java
public Object foo() {
  new Object();
  return null;
}
```

- Void Method Calls

> removes method calls to void methods

```java
public void someVoidMethod(int i) {
  System.out.println("call method someVoidMethod");
}

public int foo() {
  int i = 5;
  someVoidMethod(i);
  return i;
}
```

> will be mutate to

```java
public void someVoidMethod(int i) {
  System.out.println("call method someVoidMethod");
}

public int foo() {
  int i = 5;
  return i;
}
```


## Other useful resource

### Chinese resource:

- [變異測試 (Mutation Test) — 一種提高測試和代碼質量的 ”新” 方法速記](https://medium.com/@loverjersey/%E8%AE%8A%E7%95%B0%E6%B8%AC%E8%A9%A6-mutation-test-%E4%B8%80%E7%A8%AE%E6%8F%90%E9%AB%98%E6%B8%AC%E8%A9%A6%E5%92%8C%E4%BB%A3%E7%A2%BC%E8%B3%AA%E9%87%8F%E7%9A%84-%E6%96%B0-%E6%96%B9%E6%B3%95%E9%80%9F%E8%A8%98-35bde79a5c7a)
- [Test - 變異(Mutation)測試之你的測試到底是寫爽的，還是有效的?](https://dotblogs.com.tw/im_sqz777/2018/03/15/004634)
- [突變測試的測試模式 - Mutation Testing in Patterns](https://mutation.readthedocs.io/zh_TW/latest/)

### English resource:

- [Pitest resource](http://pitest.org/links/)
- [An intro to Mutation Testing - or why coverage sucks](https://pedrorijo.com/blog/intro-mutation/)
- [Tests Coverage is Dead — Long Live Mutation Testing](https://medium.com/appsflyer/tests-coverage-is-dead-long-live-mutation-testing-7fd61020330e)
- [Start Killing Mutants: Mutation testing your code](https://itnext.io/start-killing-mutants-mutation-test-your-code-3bea71df27f2)