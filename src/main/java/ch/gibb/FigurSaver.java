package ch.gibb;

import ch.gibb.formen.Figur;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.ArrayType;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FigurSaver {

    static SaveFile saveFile;
    static ObjectMapper objectMapper = new ObjectMapper();
    static File file = new File("saveFile.json");

    static PolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator.builder()
            .allowIfSubType(Figur.class)
            .allowIfSubType(List.class)
            .build();


    public static void save(ArrayList<Figur> figuren) throws IOException {
        saveFile = new SaveFile(figuren);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, saveFile);

    }

    public static SaveFile load() throws IOException {
        return objectMapper.readValue(file, SaveFile.class);
    }
}
