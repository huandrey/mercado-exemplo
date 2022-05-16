package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LoteRepository {
    public ArrayList<Lote> lotes;

    public LoteRepository() {
        this.lotes = new ArrayList<Lote>();
    }

        public ArrayList<Lote> getAll() {
        return this.lotes;
    }

}



