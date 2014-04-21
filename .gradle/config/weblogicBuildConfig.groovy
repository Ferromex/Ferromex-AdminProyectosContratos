environments {
    local { 
		wls {
		  adminurl = 't3://10.10.250.110:7005'
		  user = 'weblogic'
		  password = 'weblogic1'
		  targets = 'LocalServer'
		  upload = 'true'
		  verbose = 'true'
		  debug = 'false'
		}
    }
    
    dev { 
		wls {
		  adminurl = 't3://svgdldvmad01:7002'
		  user = 'weblogic'
		  password = 'Wls$12gMddl'
		  targets = 'WLS_Server'
		  upload = 'true'
		  verbose = 'true'
		  debug = 'false'
		}
    }

}