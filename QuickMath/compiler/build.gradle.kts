plugins {
    application
    kotlin("jvm").version("1.3.50")
    antlr
}

application {
    mainClassName = "xyz.mazuninky.qmath.compiler.QMathCompilerKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    antlr("org.antlr:antlr4:4.7.2")
}

sourceSets["main"].java.srcDir("build/generated-src/main/java")

//sourceSets["main"].withConvention(KotlinSourceSet::class) {
//    kotlin.srcDir("src/main/myKotlin")
//}

tasks.getByName("compileKotlin").dependsOn("generateGrammarSource")

tasks.withType<AntlrTask> {
    outputDirectory = File("build/generated/src/main/java/xyz/mazuninky/qmath/compiler/grammar").also { it.mkdirs() }
    maxHeapSize = "64m"
    arguments.addAll(listOf("-package", "xyz.mazuninky.qmath.compiler.grammar"))
}
