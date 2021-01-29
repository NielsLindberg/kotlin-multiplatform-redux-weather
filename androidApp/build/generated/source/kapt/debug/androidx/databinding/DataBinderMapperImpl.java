package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new dk.shape.kmpweather.androidApp.DataBinderMapperImpl());
  }
}
