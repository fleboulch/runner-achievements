package com.flb.runnerachievements.domain;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class RunnerTest {

    @Nested
    class Amateur {

        private final Category amateur = Category.AMATEUR;

        @Test
        void when_runner_does_at_least_10_runs_he_should_get_a_bronze_achievement() {

            // given
            int numberOfRuns = 10;

            // when
            Runner runner = new Runner("John", "Doe", amateur, buildRuns(numberOfRuns));

            // then
            assertThat(runner.getAchievements()).containsExactly(Achievement.BRONZE);
        }

        @Test
        void when_runner_does_at_least_50_runs_he_should_get_a_silver_achievement() {

            // given
            int numberOfRuns = 50;

            // when
            Runner runner = new Runner("John", "Doe", amateur, buildRuns(numberOfRuns));

            // then
            assertThat(runner.getAchievements()).containsExactly(Achievement.SILVER);
        }

        @Test
        void when_runner_does_at_least_100_runs_he_should_get_a_gold_achievement() {

            // given
            int numberOfRuns = 100;

            // when
            Runner runner = new Runner("John", "Doe", amateur, buildRuns(numberOfRuns));

            // then
            assertThat(runner.getAchievements()).containsExactly(Achievement.GOLD);
        }

    }

    @Nested
    class SemiPro {

        private final Category semiPro = Category.SEMI_PRO;

        @Test
        void when_runner_does_at_least_50_runs_he_should_get_a_bronze_achievement() {

            // given
            int numberOfRuns = 50;

            // when
            Runner runner = new Runner("John", "Doe", semiPro, buildRuns(numberOfRuns));

            // then
            assertThat(runner.getAchievements()).containsExactly(Achievement.BRONZE);
        }

        @Test
        void when_runner_does_at_least_150_runs_he_should_get_a_silver_achievement() {

            // given
            int numberOfRuns = 150;

            // when
            Runner runner = new Runner("John", "Doe", semiPro, buildRuns(numberOfRuns));

            // then
            assertThat(runner.getAchievements()).containsExactly(Achievement.SILVER);
        }

        @Test
        void when_runner_does_at_least_300_runs_he_should_get_a_gold_achievement() {

            // given
            int numberOfRuns = 300;

            // when
            Runner runner = new Runner("John", "Doe", semiPro, buildRuns(numberOfRuns));

            // then
            assertThat(runner.getAchievements()).containsExactly(Achievement.GOLD);
        }

    }

    private List<Run> buildRuns(int numberOfRuns) {
        return IntStream.rangeClosed(1, numberOfRuns)
            .mapToObj(index -> new Run("run "+ index, Distance.ofKilometer(5)))
            .collect(Collectors.toList());
    }
}
