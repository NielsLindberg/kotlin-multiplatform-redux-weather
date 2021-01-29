package dk.shape.kmpweather.androidApp.databinding;
import dk.shape.kmpweather.androidApp.R;
import dk.shape.kmpweather.androidApp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PlacesBindingImpl extends PlacesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PlacesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private PlacesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[0]
            );
        this.placesList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setVm((dk.shape.kmpweather.androidApp.PlacesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable dk.shape.kmpweather.androidApp.PlacesViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPlaceItems((me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<dk.shape.kmpweather.androidApp.PlaceViewModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmPlaceItems(me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<dk.shape.kmpweather.androidApp.PlaceViewModel> VmPlaceItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        dk.shape.kmpweather.androidApp.PlacesViewModel vm = mVm;
        me.tatarka.bindingcollectionadapter2.collections.DiffObservableList<dk.shape.kmpweather.androidApp.PlaceViewModel> vmPlaceItems = null;
        me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass<java.lang.Object> vmPlaceView = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vm != null) {
                    // read vm.placeItems
                    vmPlaceItems = vm.getPlaceItems();
                    // read vm.placeView
                    vmPlaceView = vm.getPlaceView();
                }
                updateRegistration(0, vmPlaceItems);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.placesList.setNestedScrollingEnabled(true);
            }
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapters.setAdapter(this.placesList, me.tatarka.bindingcollectionadapter2.BindingCollectionAdapters.toItemBinding(vmPlaceView), vmPlaceItems, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ItemIds)null, (me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter.ViewHolderFactory)null, (androidx.recyclerview.widget.AsyncDifferConfig)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.placeItems
        flag 1 (0x2L): vm
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}