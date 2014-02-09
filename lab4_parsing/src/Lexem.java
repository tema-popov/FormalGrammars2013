/**
 * Author: Artem Popov <jambo@yandex-team.ru>
 * Date: 02.06.13
 */
public class Lexem {
    public static final Lexem END_LEXEM = new Lexem("END", "$");
    public static final Lexem EPS_LEXEM = new Lexem("EPS", "EPS");
    public static final Lexem REAL_END_LEXEM = new Lexem("REAL_END", "$$$");
    final String name, value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lexem lexem = (Lexem) o;

        if (!name.equals(lexem.name)) return false;
        if (!value.equals(lexem.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Lexem{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public Lexem(String name, String value) {
        this.name = name;
        this.value = value;
    }
}
