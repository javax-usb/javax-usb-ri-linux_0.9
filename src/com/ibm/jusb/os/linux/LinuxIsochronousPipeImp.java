package com.ibm.jusb.os.linux;

/**
 * Copyright (c) 1999 - 2001, International Business Machines Corporation.
 * All Rights Reserved.
 *
 * This software is provided and licensed under the terms and conditions
 * of the Common Public License:
 * http://oss.software.ibm.com/developerworks/opensource/license-cpl.html
 */

import javax.usb.UsbException;
import javax.usb.util.*;

import com.ibm.jusb.*;
import com.ibm.jusb.os.*;

/**
 * LinuxPipeOsImp implementation for Isochronous pipe.
 * <p>
 * This must be set up before use.  See {@link com.ibm.jusb.os.linux.LinuxPipeOsImp LinuxPipeOsImp} for details.
 * @author Dan Streetman
 */
class LinuxIsochronousPipeImp extends LinuxPipeOsImp
{
	/** Constructor */
    public LinuxIsochronousPipeImp( UsbPipeImp pipe, LinuxInterfaceOsImp iface ) { super(pipe,iface); }

	//*************************************************************************
	// Public methods

//FIXME - implement async/syncSubmit(List)
}

