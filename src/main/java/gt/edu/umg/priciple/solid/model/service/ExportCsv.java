package gt.edu.umg.priciple.solid.model.service;

import gt.edu.umg.priciple.solid.model.dto.GenericObject;
import gt.edu.umg.priciple.solid.model.entity.FileEntity;

public class ExportCsv implements IExportFile {
    public ExportCsv() {
    }

    public GenericObject buildFile() {
        FileEntity entity = new FileEntity();
        entity.setNameFile("example.csv");
        entity.setSizeFile("0.9MB");
        return new GenericObject(entity);
    }

}