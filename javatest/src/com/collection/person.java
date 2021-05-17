package com.collection;

public class person{
    private String name;
    private int score;
    private int id;

    public person() {
    }

    public person(String name, int score, int id) {
        this.name = name;
        this.score = score;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        person person = (person) o;

        return score == person.score;
    }

    @Override
    public int hashCode() {
        return score;
    }

//    @Override
//    public int compareTo(Object o) {
//        return Integer.compare(((person) o).score, this.score);
//    }

}
