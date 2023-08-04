open module test_test {
    requires static lombok;
    requires org.junit.jupiter;
    requires test;

    requires transitive org.junit.jupiter.engine;
    requires transitive org.junit.jupiter.api;
}