Do you really get classloaders examples
=======================================

This repository contains code samples and snippets used in a "Do you really get classloaders?" talk

Abstract: Do you really get classloaders? 
========================================
Class loaders are at the core of the Java language. Java EE containers, OSGi, NetBeans modules, Grails and many others use class loaders heavily. Yet when something goes wrong, do you know how to solve it? In this session we'll take a tour of the Java class loading mechanism. We will look at typical problems that you get with class loading and how to solve them. ClassNoDefError, IncompatibleClassChangeError, LinkageError and others are symptoms of specific things going wrong that you can usually find and fix. We'll go through a hands on demos of problems with corresponding solutions.


Structure
=========

This repository contains 3 projects:
* cl-demo
* cl-demo-jar
* cl-demo-shared

Cl-demo is the main web-application that is used to show different classloading related errors one can meet. It uses both cl-demo-jar and cl-demo-shared as dependencies. 

Cl-demo-jar is not used for the deployment. Instead an intentionally crippled jar is bundled with cl-demo when it is deployed. That jar is bundled within the cl-demo/WebContent/WEB-INF/lib directory. 

Cl-shared-jar represents a shared library that should be available from your classpath, put it into a shared directory on your application server. For example if you use Tomcat that would be: $CATALINA_HOME/lib.

