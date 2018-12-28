### Java Hello world

Hello.java:
```Java
/* 
    public：表示的这个程序的访问权限，表示的是任何的场合可以被引用，这样 Java 虚拟机就可以找到 main() 方法,从而来运行 javac 程序。
    static： 表明方法是静态的，不依赖类的对象的，是属于类的，在类加载的时候 main() 方法也随着加载到内存中去。
 */

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello！");
    }
}

```

static 可以修饰一个代码块：

```Java

public class Hello {
    static {
        System.out.println("Hello World!");
        System.exit(1);
    }
    public static void main(String[] args) {
        System.out.println("Never been here");
    }
}

```

执行如下：

```java
λ javac Hello.java
λ java Hello
Hello World!
λ echo $?
1
```

注意：执行java命令时，不能加class。

打印命令行参数：

```Java
public class PArgs {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < args.length; i++) {
            System.out.println(i + ":" + args[i]);
        }
    }
}
```

使用 `hexdump` 查看编译好的文件：

```bash
λ hexdump Hello.class
0000000 ca fe ba be 00 00 00 34 00 1e 0a 00 06 00 10 09
0000010 00 11 00 12 08 00 13 0a 00 14 00 15 07 00 16 07
0000020 00 17 01 00 06 3c 69 6e 69 74 3e 01 00 03 28 29
0000030 56 01 00 04 43 6f 64 65 01 00 0f 4c 69 6e 65 4e
```

可以发现，class文件都是 ca fe ba be 开头的，
后面的四个 00 00 00 34 表示编译出来的版本

参考：

http://www.runoob.com/java/java-tutorial.html

https://blog.csdn.net/renfufei/article/details/69938592

https://blog.csdn.net/hongweigg/article/details/52598995

