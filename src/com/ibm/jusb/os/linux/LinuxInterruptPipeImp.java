package com.ibm.jusb.os.linux;

/**
 * Copyright (c) 1999 - 2001, International Business Machines Corporation.
 * All Rights Reserved.
 *
 * This software is provided and licensed under the terms and conditions
 * of the Common Public License:
 * http://oss.software.ibm.com/developerworks/opensource/license-cpl.html
 */

import com.ibm.jusb.*;
import com.ibm.jusb.os.*;

/**
 * LinuxPipeImp imeplementation for Interrupt pipe.
 * <p>
 * This must be set up before use.  See {@link com.ibm.jusb.os.linux.LinuxPipeOsImp LinuxPipeOsImp} for details.
 * @author Dan Streetman
 */
class LinuxInterruptPipeImp extends LinuxPipeOsImp
{
	/** Constructor */
	public LinuxInterruptPipeImp( UsbPipeImp pipe, LinuxInterfaceOsImp iface ) { super(pipe,iface); }

	//*************************************************************************
	// Public methods

}
