package com.maxiaohua.genealogy.fw.core.util;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;


abstract public class ConvertUtil {
    
    public static Object[] toArray(
            Object obj) {
        if (obj == null) {
            return new Object[0];
        } else if (obj.getClass().isArray()) {
            return (Object[]) obj;
        } else if (obj instanceof Collection) {
            return ((Collection<?>) obj).toArray();
        }
        return new Object[] { obj };
    }

    
    @SuppressWarnings("unchecked")
    public static <E> List<E> toList(
            Object obj,
            Class<E> elementClass) throws IllegalArgumentException {
        if (elementClass == null) {
            throw new IllegalArgumentException("Argument 'elementClass' (" + Class.class.getName() + ") is null");
        }

        Object[] array = toArray(obj);
        List<E> result = new ArrayList<E>();
        for (Object element : array) {
            if (element != null && !elementClass.isAssignableFrom(element.getClass())) {
                String message = "Unable to cast '" + element.getClass().getName() + "' to '" + elementClass.getName() + "'";
                throw new IllegalArgumentException(message, new ClassCastException(message));
            }
            result.add((E) element);
        }
        return result;
    }

    
    public static <T> T convert(
            Object obj,
            Class<T> clazz) throws IllegalArgumentException {
        return convert(obj, clazz, true);
    }

    
    public static <T> T convertIfNotNull(
            Object obj,
            Class<T> clazz) throws IllegalArgumentException {
        return convert(obj, clazz, false);
    }

    
    @SuppressWarnings("unchecked")
    public static <T> T convert(
            Object obj,
            Class<T> clazz,
            boolean allowsNull) throws IllegalArgumentException {

        if (clazz == null) {
            throw new IllegalArgumentException("Argument 'clazz' (" + Object.class.getName() + ") is null");
        }

        if (obj == null) {
            if (!allowsNull) {
                String message = "Unable to cast 'null' to '" + clazz.getName() + "'";
                throw new IllegalArgumentException(message, new ClassCastException(message));
            }
            return null;
        }

        if (clazz.isAssignableFrom(obj.getClass())) {
            return (T) obj;
        }

        Object result = null;
        try {
            result = ConvertUtils.convert(obj.toString(), clazz);
        } catch (ConversionException e) {
            throw new IllegalArgumentException(e);
        }
        return (T) result;
    }

    
    public static Object convertPrimitiveArrayToList(
            Object value) {
        if (value == null) {
            return value;
        }
        Class<?> type = value.getClass().getComponentType();
        if (type == null) {
            return value;
        }
        if (!type.isPrimitive()) {
            return value;
        }

        List<Object> list = new ArrayList<Object>();

        if (value instanceof boolean[]) {
            for (boolean data : (boolean[]) value) {
                list.add(data);
            }
        } else if (value instanceof byte[]) {
            for (byte data : (byte[]) value) {
                list.add(Byte.toString(data));
            }
        } else if (value instanceof char[]) {
            for (char data : (char[]) value) {
                list.add(Character.toString(data));
            }
        } else if (value instanceof double[]) {
            for (double data : (double[]) value) {
                list.add(Double.toString(data));
            }
        } else if (value instanceof float[]) {
            for (float data : (float[]) value) {
                list.add(Float.toString(data));
            }
        } else if (value instanceof int[]) {
            for (int data : (int[]) value) {
                list.add(Integer.toString(data));
            }
        } else if (value instanceof long[]) {
            for (long data : (long[]) value) {
                list.add(Long.toString(data));
            }
        } else if (value instanceof short[]) {
            for (short data : (short[]) value) {
                list.add(Short.toString(data));
            }
        }
        return list;
    }

    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static List<Map<String, Object>> toListOfMap(
            Object obj) throws IllegalArgumentException {
        Object[] array = ConvertUtil.toArray(obj);
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        for (Object object : array) {

            Map<String, Object> map = null;
            if (object instanceof Map) {
                map = (Map) object;
            } else {
                try {
                    map = PropertyUtils.describe(object);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException(e);
                } catch (InvocationTargetException e) {
                    throw new IllegalArgumentException(e);
                } catch (NoSuchMethodException e) {
                    throw new IllegalArgumentException(e);
                }
            }

            map.remove("class");
            result.add(map);
        }

        return result;
    }
}