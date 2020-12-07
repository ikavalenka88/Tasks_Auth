package TaskFirst;

public class Students implements Comparable<Students> {
    int id;
    String name;
    String surname;
    int age;

    public Students(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString() {
        final StringBuffer st = new StringBuffer("Student: ");
        st.append("id: ").append(id);
        st.append(" name: ").append(name);
        st.append("surname: ").append(surname);
        st.append("age: ").append(age);
        st.append(".");
        return st.toString();
    }

    public int compareTo(Students otherStudens) {
        if (this.id == otherStudens.id) {
            return 0;
        } else if (this.id < otherStudens.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
