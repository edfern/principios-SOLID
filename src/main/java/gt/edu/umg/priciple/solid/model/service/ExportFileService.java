package gt.edu.umg.priciple.solid.model.service;

import gt.edu.umg.priciple.solid.model.dto.GenericObject;
import gt.edu.umg.priciple.solid.model.entity.FileEntity;

public class ExportFileService {


    public ExportFileService() {
    }

    /**
     * Esta clase es la encargada de realizar la simulación de exportación
     * de cada un archivo a diferentes tipos (JSON, HTML Y CSV)
     */

    public GenericObject exportJson() {
        FileEntity entity = new FileEntity();
        entity.setNameFile("example.json");
        entity.setSizeFile("1.5MB");
        return new GenericObject(entity);
    }

    public GenericObject exportHtml() {
        FileEntity entity = new FileEntity();
        entity.setNameFile("example.html");
        entity.setSizeFile("5.0MB");
        return new GenericObject(entity);
    }
    public GenericObject exportCsv() {
        FileEntity entity = new FileEntity();
        entity.setNameFile("example.Csv");
        entity.setSizeFile("0.9MB");
        return new GenericObject(entity);
    }

}