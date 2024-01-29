<h1 align="center" style="text-align:center;">
Solon Java Framework
</h1>
<p align="center">
	<strong>Java 新的生态，更小、更快、更简单！</strong>
</p>
<p align="center">
	<a href="https://solon.noear.org/">https://solon.noear.org</a>
</p>

<p align="center">
    <a target="_blank" href="https://central.sonatype.com/search?q=org.noear%3Asolon-parent">
        <img src="https://img.shields.io/maven-central/v/org.noear/solon.svg?label=Maven%20Central" alt="Maven" />
    </a>
    <a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0.txt">
		<img src="https://img.shields.io/:License-Apache2-blue.svg" alt="Apache 2" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html">
		<img src="https://img.shields.io/badge/JDK-8-green.svg" alt="jdk-8" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html">
		<img src="https://img.shields.io/badge/JDK-11-green.svg" alt="jdk-11" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">
		<img src="https://img.shields.io/badge/JDK-17-green.svg" alt="jdk-17" />
	</a>
    <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html">
		<img src="https://img.shields.io/badge/JDK-21-green.svg" alt="jdk-21" />
	</a>
    <br />
    <a target="_blank" href='https://gitee.com/noear/solon/stargazers'>
		<img src='https://gitee.com/noear/solon/badge/star.svg' alt='gitee star'/>
	</a>
    <a target="_blank" href='https://github.com/noear/solon/stargazers'>
		<img src="https://img.shields.io/github/stars/noear/solon.svg?logo=github" alt="github star"/>
	</a>
</p>

<br/>
<p align="center">
	<a href="https://jq.qq.com/?_wv=1027&k=kjB5JNiC">
	<img src="https://img.shields.io/badge/QQ交流群-22200020-orange"/></a>
</p>

<hr />

启动快 5 ～ 10 倍；qps 高 2～ 3 倍；运行时内存节省 1/3 ~ 1/2；打包可以缩到 1/2 ~ 1/10

<hr />

本项目基于 java 17 进行编译和发布，专门争对 jakarta 相关接口进行“适配”。

```xml
<modules>
    <module>solon-jakarta-projects/solon-boot/solon.boot.jetty.add.jsp.jakarta</module>
    <module>solon-jakarta-projects/solon-boot/solon.boot.jetty.jakarta</module>
    <module>solon-jakarta-projects/solon-boot/solon.boot.undertow.add.jsp.jakarta</module>
    <module>solon-jakarta-projects/solon-boot/solon.boot.undertow.jakarta</module>

    <module>solon-jakarta-projects/solon-web/solon.web.servlet.jakarta</module>

    <module>solon-jakarta-projects/solon-render/solon.view.jsp.jakarta</module>
    
    <module>solon-jakarta-projects/solon-plugin-data/hibernate-jakarta-solon-plugin</module>
</modules>
```
