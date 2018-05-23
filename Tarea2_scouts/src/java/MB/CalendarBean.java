/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;
import javax.enterprise.context.ApplicationScoped;



import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;



@ManagedBean

@ViewScoped

public class CalendarBean {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private Date currentDay = new Date();

        private static String grupo;

    public void seteandoGrupo(String s){
        grupo=s;
    }
    public String geteandoGrupo(){
        return grupo;
    }

	public Date getCurrentDay() {

		return currentDay;

	}



	public void setCurrentDay(Date currentDay) {

		this.currentDay = currentDay;

	}



	/**

	 * This method return an array of dates. Every date must formatted as

	 * 'YYYY-MM-DD' including single quotes, in order to be parsed by

	 * javascript.

	 * 

	 * The array has three dates, yesterday, today and tomorrow

	 * 

	 * @return Array of string dates

	 */

	public String[] getSpecialDays() {

		String[] result = new String[3];



		Calendar cal = Calendar.getInstance();



		// yesterday

		cal.add(Calendar.DATE, -1);

		result[0] = String.format("'%s'", sdf.format(cal.getTime()));



		// Today

		cal.add(Calendar.DATE, 1);

		result[1] = String.format("'%s'", sdf.format(cal.getTime()));



		// Tomorrow

		cal.add(Calendar.DATE, 1);

		result[2] = String.format("'%s'", sdf.format(cal.getTime()));



		return result;

	}

}