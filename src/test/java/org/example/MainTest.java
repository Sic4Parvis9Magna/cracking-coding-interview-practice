package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Should return echo")
    void shouldReturnEcho() {
        // Given
        Main sut = new Main();
        String testMessage = "Test!";

        // When
        String actualResult = sut.echo(testMessage);

        // Then
        Assertions.assertEquals(testMessage, actualResult);
    }
}