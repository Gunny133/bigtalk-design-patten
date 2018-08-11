package com.gunny.prototype;

public class ConcreteProtoType1 implements ProtoType {
    public ProtoType clone() {
        try {
             /**
             * 创建对象的浅表副本（浅复制）。创建一个新对象，将该对象的非静态字段复制到新对象
              * 如果为值类型（如基本类型），则对该字段进行逐位复制
              * 如果未引用类型，复制引用，但不复制引用对象，原始对象和副本引用同一对象
             */

            return (ProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
