LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

# Here we give our module name and source file(s)
LOCAL_MODULE    := ndk_foo
LOCAL_SRC_FILES := ndk_foo.c

include $(BUILD_SHARED_LIBRARY)