# Repair with analysis of cause-effect chains. [![Build Status](https://travis-ci.org/Mama59/CauseEffectChain.svg?branch=master)](https://travis-ci.org/Mama59/CauseEffectChain) [![Coverage Status](https://coveralls.io/repos/github/Mama59/CauseEffectChain/badge.svg?branch=master)](https://coveralls.io/github/Mama59/CauseEffectChain?branch=master)

Delta-debugging for Java, by Marine Bal, Antonin Durey, José Pansa and Badr Rahal.

## [**Mutation Coverage** : **73%**](https://mama59.github.io/CauseEffectChain/ "Pitest Mutation Coverage Report") 

To provide high standard test coverage for our Delta-debugging tool, we used Pitest, a mutation testing system for Java.

Pitest will mutate the code in our project defined by the targetClasses we set in the pom file. 

```xml
<plugin>
    <groupId>org.pitest</groupId>
    <artifactId>pitest-maven</artifactId>
    <version>1.1.11</version>
    <configuration>
        <targetClasses>
            <param>fr.univlille1.m2iagl.opl.causechaineffect.action.ddebugger.*</param>
            <param>fr.univlille1.m2iagl.opl.causechaineffect.action.helper.*</param>
            <param>fr.univlille1.m2iagl.opl.causechaineffect.challenge.*</param>
            <param>fr.univlille1.m2iagl.opl.causechaineffect.jdb.*</param>
            <param>fr.univlille1.m2iagl.opl.causechaineffect.model.*</param>
            <param>fr.univlille1.m2iagl.opl.causechaineffect.main.*</param>
        </targetClasses>
    </configuration>
</plugin>
```

To run pitest directly from the commandline :
```
mvn clean install
mvn org.pitest:pitest-maven:mutationCoverage
```

Or to speed-up repeated analysis of the same codebase, you can use this command to generate the mutation coverage report :
```
mvn -DwithHistory=true org.pitest:pitest-maven:mutationCoverage
```

This will output an html report **index.html** to **target/pit-reports**.




