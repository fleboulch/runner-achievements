package com.flb.runnerachievements.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public class Runner {

    private final String firstname;
    private final String lastname;
    private final Category category;
    private final List<Run> runs;

    public Runner(String firstname, String lastname, Category category, List<Run> runs) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.category = category;
        this.runs = runs;
    }

    public List<Achievement> getAchievements() {
        List<Achievement> achievements = new ArrayList<>();
        if (category == Category.AMATEUR) {
            if (runs.size() >= 100) {
                achievements.add(Achievement.GOLD);
            } else if (runs.size() >= 50) {
                achievements.add(Achievement.SILVER);
            } else if (runs.size() >= 10) {
                achievements.add(Achievement.BRONZE);
            }

        } else if (category == Category.SEMI_PRO) {
            if (runs.size() >= 300) {
                achievements.add(Achievement.GOLD);
            } else if (runs.size() >= 150) {
                achievements.add(Achievement.SILVER);
            } else if (runs.size() >= 50) {
                achievements.add(Achievement.BRONZE);
            }
        }

        return achievements;
    }
}
