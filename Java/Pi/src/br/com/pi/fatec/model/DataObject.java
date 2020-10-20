package br.com.pi.fatec.model;

import br.com.pi.fatec.model.Abstractions.DataObjectContract;

public abstract class DataObject<T> extends SqlCnn implements DataObjectContract<T> {

}
