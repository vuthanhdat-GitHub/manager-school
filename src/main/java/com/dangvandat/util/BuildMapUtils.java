package com.dangvandat.util;

import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * BuildMapUtils
 *
 * @author DatDV
 */
@Component
public class BuildMapUtils {

    /**
     * buildMapSearch : convert Object to Map using search in database
     *
     * @param object : Object using convert to Map
     * @return Map <String,Object>
     */
    public Map<String, Object> buildMapSearch(Object object) {
        Map<String, Object> result = new HashMap<>();
        try {
            Field[] fields = object.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.get(object) != null && !field.get(object).equals("")) {
                    if (field.get(object) instanceof Integer) {
                        result.put(field.getName().toLowerCase(), field.get(object));
                    } else if (field.get(object) instanceof Long) {
                        result.put(field.getName().toLowerCase(), field.get(object));
                    } else {
                        if (!field.getName().contains("Date")) {
                            if (field.getName().equals("status")) {
                                result.put(field.getName().toLowerCase(), field.get(object).toString().trim());
                            }else {
                                result.put(field.getName().toLowerCase(), BuildQueryUtils.formatLikeStringSql(field.get(object).toString().trim()));
                            }
                        } else {
                            if (field.getName().contains("Date")) {
                                result.put(field.getName().toLowerCase(), KUtils.convertStringRequestToTimesTamp(KUtils.formatDateTimeQuery(field.get(object).toString().trim()), "dd/MM/yyyy"));
                            }
                        }
                    }
                }
            }
        } catch (IllegalArgumentException | IllegalAccessException | ParseException e) {

        }
        return result;
    }
}
