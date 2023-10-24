/**
 * @author Serhii Klunniy
 */
public class GoodPupil extends Pupil {

    @Override
    void study() {
        System.out.println("good 12");;
    }

    @Override
    void read() {
        System.out.println("читает по одной книге в неделю");
    }

    @Override
    void write() {
        super.write();
    }

    @Override
    void relax() {
        super.relax();
    }
}
