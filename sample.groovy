import groovy.time.TimeCategory

currentDate =  new Date()

println currentDate

use( TimeCategory ) {
    scheduledStartDate  = currentDate + 6.hours
}

use( TimeCategory ) {
    scheduleEnddate = scheduledStartDate + 12.hours
}

println scheduledStartDate
println scheduleEnddate
