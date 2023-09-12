package com.code.unittest

class MainViewModel(val cuboidViewModel: CuboidModel) {
    fun getCircumferences() = cuboidViewModel.getCircumferences()

    fun getSurfaceArea() = cuboidViewModel.getSurfaceArea()

    fun getVolume() = cuboidViewModel.getVolume()

    fun save(w:Double, l:Double, h: Double){
        cuboidViewModel.save(w,l,h)
    }

}