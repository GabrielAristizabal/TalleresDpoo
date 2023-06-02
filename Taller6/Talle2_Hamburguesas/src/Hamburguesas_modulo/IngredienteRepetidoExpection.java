package Hamburguesas_modulo;

@SuppressWarnings("serial")

public class IngredienteRepetidoExpection extends HambueguesaExeption{
    private String repetido;

    public IngredienteRepetidoExpection(String repetido) {
        super("Error: Ingrediente repetido - " + repetido);
        this.repetido = repetido;
    }

    public String getrepetido() {
        return repetido;
    }
}