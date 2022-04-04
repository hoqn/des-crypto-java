# DES Cypto

![Java](https://img.shields.io/badge/Java-1.8-brightgreen?logo=Java)

[DES](https://en.wikipedia.org/wiki/Data_Encryption_Standard)
를 구현하는 Java 프로젝트

by _전호균 (Hogyun Jeon)_

## 빠른 사용법 ⚡

0. import

```java
import net.hoqn.des.DES;
import net.hoqn.des.DESKey; // 필요시에만
```

1. `DES` 객체를 생성합니다.

```java
DES des = new DES(0x133457799BBCDFF1L /* Key Value (long) Here */);

// or

DESKey desKey = new DESKey(0x133457799BBCDFF1L /* Key Value (long) Here */);
DES des = new DES(desKey);
```

2. 암호화를 진행하려면

```java
long ciphertext = des.encrypt(0x0123456789ABCDEFL /* Plaintext Here */);
```

3. 복호화를 진행하려면

```java
long plaintext = des.decrypt(0x85E813540F0AB405L /* Plaintext Here */);
```

4. 서브키 정보를 얻어오려면

```java
long[] subKeys = desKey.getSubKeys();

// or

long firstSubKey = desKey.getSubKey(0); // 0부터 시작된다는 점 주의
long lastSubKey = desKey.getSubKey(15);
```

## 참고자료

- https://page.math.tu-berlin.de/~kant/teaching/hess/krypto-ws2006/des.htm