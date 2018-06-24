databaseChangeLog = {
    include file: '20180605_1100_configure_db.groovy'
    include file: '20180605_1105_create_hibernate_sequence.groovy'
    include file: '20180605_1107_grant_privileges_on_hibernate_sequence.groovy'
    include file: '20180605_1110_create_workorders_table.groovy'
    include file: '20180605_1121_grant_privileges_on_workorders_table.groovy'
    include file: '20180607_1515_arg-23_add_department_and_payroll_flag_to_workorders_table.groovy'
}
