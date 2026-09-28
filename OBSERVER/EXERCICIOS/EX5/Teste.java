
public class Teste {

    public static void main(String[] args) {
        Blog b = new Blog();

        b.attach(new AssinanteEmail("Bruno"));
        b.attach(new AssinanteEmail("Renato"));

        b.publicar("Factory feito");
    }
}
