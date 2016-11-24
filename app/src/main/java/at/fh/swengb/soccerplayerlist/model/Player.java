package at.fh.swengb.soccerplayerlist.model;

import java.io.Serializable;

/**
 * Created by Lukas on 24.11.2016.
 */

public class Player implements Serializable {
    private String firstName;
    private String lastName;
    private String age;
    private String nation;
    private String club;


    public Player(){

    }

    public Player(String firstName, String lastName, String age, String nation, String club) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nation = nation;
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (firstName != null ? !firstName.equals(player.firstName) : player.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(player.lastName) : player.lastName != null)
            return false;
        if (age != null ? !age.equals(player.age) : player.age != null) return false;
        if (nation != null ? !nation.equals(player.nation) : player.nation != null) return false;
        return club != null ? club.equals(player.club) : player.club == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (club != null ? club.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(firstName).append(" ")
                .append(lastName).append('\n')
                .append(age).append('\n')
                .append(nation).append('\n')
                .append(club);
        return sb.toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
