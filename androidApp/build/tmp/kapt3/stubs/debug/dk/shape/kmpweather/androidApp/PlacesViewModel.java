package dk.shape.kmpweather.androidApp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R5\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00010\u0001 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Ldk/shape/kmpweather/androidApp/PlacesViewModel;", "", "()V", "placeItems", "Lme/tatarka/bindingcollectionadapter2/collections/DiffObservableList;", "Ldk/shape/kmpweather/androidApp/PlaceViewModel;", "getPlaceItems", "()Lme/tatarka/bindingcollectionadapter2/collections/DiffObservableList;", "placeView", "Lme/tatarka/bindingcollectionadapter2/itembindings/OnItemBindClass;", "kotlin.jvm.PlatformType", "getPlaceView", "()Lme/tatarka/bindingcollectionadapter2/itembindings/OnItemBindClass;", "value", "", "Ldk/shape/weatherstate/places/Place;", "places", "getPlaces", "()Ljava/util/List;", "setPlaces", "(Ljava/util/List;)V", "Companion", "androidApp_debug"})
public final class PlacesViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<dk.shape.weatherstate.places.Place> places;
    @org.jetbrains.annotations.NotNull()
    private final me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<dk.shape.kmpweather.androidApp.PlaceViewModel> placeItems = null;
    private final me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass<java.lang.Object> placeView = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<dk.shape.kmpweather.androidApp.PlaceViewModel> itemDiffCallback = null;
    public static final dk.shape.kmpweather.androidApp.PlacesViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dk.shape.weatherstate.places.Place> getPlaces() {
        return null;
    }
    
    public final void setPlaces(@org.jetbrains.annotations.NotNull()
    java.util.List<dk.shape.weatherstate.places.Place> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<dk.shape.kmpweather.androidApp.PlaceViewModel> getPlaceItems() {
        return null;
    }
    
    public final me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass<java.lang.Object> getPlaceView() {
        return null;
    }
    
    public PlacesViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Ldk/shape/kmpweather/androidApp/PlacesViewModel$Companion;", "", "()V", "itemDiffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ldk/shape/kmpweather/androidApp/PlaceViewModel;", "androidApp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}