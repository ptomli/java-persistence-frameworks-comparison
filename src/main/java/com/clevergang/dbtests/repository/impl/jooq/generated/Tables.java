package com.clevergang.dbtests.repository.impl.jooq.generated;


import com.clevergang.dbtests.repository.impl.jooq.generated.tables.Company;
import com.clevergang.dbtests.repository.impl.jooq.generated.tables.Department;
import com.clevergang.dbtests.repository.impl.jooq.generated.tables.Employee;
import com.clevergang.dbtests.repository.impl.jooq.generated.tables.Project;
import com.clevergang.dbtests.repository.impl.jooq.generated.tables.Projectemployee;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.company</code>.
     */
    public static final Company COMPANY = com.clevergang.dbtests.repository.impl.jooq.generated.tables.Company.COMPANY;

    /**
     * The table <code>public.department</code>.
     */
    public static final Department DEPARTMENT = com.clevergang.dbtests.repository.impl.jooq.generated.tables.Department.DEPARTMENT;

    /**
     * The table <code>public.employee</code>.
     */
    public static final Employee EMPLOYEE = com.clevergang.dbtests.repository.impl.jooq.generated.tables.Employee.EMPLOYEE;

    /**
     * The table <code>public.project</code>.
     */
    public static final Project PROJECT = com.clevergang.dbtests.repository.impl.jooq.generated.tables.Project.PROJECT;

    /**
     * The table <code>public.projectemployee</code>.
     */
    public static final Projectemployee PROJECTEMPLOYEE = com.clevergang.dbtests.repository.impl.jooq.generated.tables.Projectemployee.PROJECTEMPLOYEE;
}
