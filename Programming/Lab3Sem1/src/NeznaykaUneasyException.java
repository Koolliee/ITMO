public class NeznaykaUneasyException extends Exception {
    public NeznaykaUneasyException(String message) {
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage() + "Ошибка: Незнайке не по себе! Он сейчас не может грузить.";
    }
}
