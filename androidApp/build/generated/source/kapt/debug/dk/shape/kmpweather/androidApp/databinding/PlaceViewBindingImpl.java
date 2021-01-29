package dk.shape.kmpweather.androidApp.databinding;
import dk.shape.kmpweather.androidApp.R;
import dk.shape.kmpweather.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlaceViewBindingImpl extends PlaceViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mVmOnClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public PlaceViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private PlaceViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.temperature.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((dk.shape.kmpweather.androidApp.PlaceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable dk.shape.kmpweather.androidApp.PlaceViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener vmOnClickAndroidViewViewOnClickListener = null;
        dk.shape.kmpweather.androidApp.PlaceViewModel vm = mVm;
        dk.shape.weatherstate.forecast.Temperature vmPlaceTemperature = null;
        java.lang.String vmPlaceTemperatureToString = null;
        dk.shape.weatherstate.places.Place vmPlace = null;
        java.lang.String vmPlaceCountry = null;
        java.lang.String vmPlaceCity = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (vm != null) {
                    // read vm::onClick
                    vmOnClickAndroidViewViewOnClickListener = (((mVmOnClickAndroidViewViewOnClickListener == null) ? (mVmOnClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mVmOnClickAndroidViewViewOnClickListener).setValue(vm));
                    // read vm.place
                    vmPlace = vm.getPlace();
                }


                if (vmPlace != null) {
                    // read vm.place.temperature
                    vmPlaceTemperature = vmPlace.getTemperature();
                    // read vm.place.country
                    vmPlaceCountry = vmPlace.getCountry();
                    // read vm.place.city
                    vmPlaceCity = vmPlace.getCity();
                }


                if (vmPlaceTemperature != null) {
                    // read vm.place.temperature.toString()
                    vmPlaceTemperatureToString = vmPlaceTemperature.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, vmPlaceTemperatureToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, vmPlaceCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, vmPlaceCountry);
            this.temperature.setOnClickListener(vmOnClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private dk.shape.kmpweather.androidApp.PlaceViewModel value;
        public OnClickListenerImpl setValue(dk.shape.kmpweather.androidApp.PlaceViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}