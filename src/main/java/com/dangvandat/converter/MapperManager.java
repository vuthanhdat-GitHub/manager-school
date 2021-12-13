package com.dangvandat.converter;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NameTokenizers;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

/**
 * MapperManager
 *
 * @author DatDV
 */
public class MapperManager<D , E> {

    @Autowired
    private ModelMapper modelMapper;

    private Class<D> dClass;

    private Class<E> eClass;

    public MapperManager(){
        Type type = getClass().getGenericSuperclass();
        ParameterizedType parameterType = (ParameterizedType) type;
        dClass = (Class<D>) parameterType.getActualTypeArguments()[0];
        eClass = (Class<E>) parameterType.getActualTypeArguments()[1];
    }

    public D toDto(E entity) {
        modelMapper.getConfiguration().setSourceNameTokenizer(NameTokenizers.UNDERSCORE);
        D result = modelMapper.map(entity , dClass);
        return result;
    }

    public E toEntity(D dto) {
        modelMapper.getConfiguration().setSourceNameTokenizer(NameTokenizers.UNDERSCORE);
        E result = modelMapper.map(dto , eClass);
        return result;
    }

    public List<E> toListEntity(List<D> dList) {
        modelMapper.getConfiguration().setSourceNameTokenizer(NameTokenizers.UNDERSCORE);
        List<E> result = dList.stream().map(dto -> modelMapper.map(dto , eClass)).collect(Collectors.toList());
        return result;
    }

    public List<D> toListDto(List<E> eList) {
        modelMapper.getConfiguration().setSourceNameTokenizer(NameTokenizers.UNDERSCORE);
        List<D> result = eList.stream().map(entity -> modelMapper.map(entity , dClass)).collect(Collectors.toList());
        return result;
    }
}
