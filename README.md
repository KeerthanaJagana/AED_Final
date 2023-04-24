# AED_Final
# Resort_Management_System

## Problem Statement:

With the onset of Covid in past two years, one of the pressing challenge is falling demands for resort bookings all across the world. In order to regain trust of consumers, it's extremely important to have transparency in interactions between Resort Managers and Consumers. A utility solution is the need of the hour where consumer can send digital requests for multiple facilities while staying at resort to experience a contact-free, safe stay. Solving this challenge would act as a big booster for the hospitality and tourism industry world-wide.

## About Eco-System:

The purpose of Resort Management System is to provide a solution for consumers to digitally avail resort services in a contact-free, transparent and accountability driven manner. This solution would ensure in boosting resort businesses in a withering hospitality economy.

## Enterprises:

1. Hotel
2. Theatre
3. Restaurant
4. Celebration


## Organisations:
1. Tour Services
2. Safari Services
3. Wedding
4. Anniversary
5. Birthday Parties
6. Delivery Agent
7. MusicBand
8. Stand Up Comedy
9. Magician

## Roles:
1. Hotel Admin
2. Customer
3. Celebration Manager
4. Restaurant Manager
5. Delivery Agent
6. Theatre Manager
7. Magician
8. Comedian
9. MusicBand

Database Used : *DB4O*


## Features:
1. Each Service Role has ability to CRUD their service utilities and manage requests of consumers for their services.
2. Each Service Role has a work area where they can view and decide the fate of those customer requests
3. Requests have various statuses attached to them including - Pending, In-progress, Accepted, Rejected.
4. Customer has set of 6 facilities from which they can choose and avail services by sending requests.
5. Once a service request has been approved, customers will receive an email notification confirming their booking.
6. Customer booking a resort vehicle have the option of choosing their destination on a map.
7. Our project displays a tree view of file system for easy comprehension.
8. Resort Admin role has the ability to onboard members for different service roles.
9. Resort Admin can also set a cleaning schedule for Janitors to deliver on.
10. An advanced analytical reporting module has been developed for Admin to get insights into the workings and profitability of the Resort. 
11. A robust billing system is in place for customers to get detailed view on what all utilities have they availed, and what's the total price for each of those services.
12. Special attention has been given to make the application interaction intuitive, colorful and user-friendly.
13. Validations have been done for all user entered fields.

## Contributions

Bhavya:

1. Classes for Enterprise Hotel and Restaurant – PSH_Business, PSH_EnterCatag_Hotel, PSH_Enterprise_Catalog, PSH_RoomBooking, PSH_EnterCatag_Restaurant, PSH_RoomType, PSH_RoomsList, PSH_TourGuide, PSH_Safari, PSH_DeliveryAgent, PSH_Location

  2. Services Classes for PSH_EnterCatagService, PSH_EnterCatag_HotelService, PSH_EnterCatag_RestaurantService

3. UI for HotelManagerRole and RestaurantManagerRole
4. Pie Chart for customerReport


Keerthana:

1. Classes for PSH_EnterCatag_Theatre, PSH_Theatre_Magician, PSH_Theatre_MagicianOrg, PSH_Theatre_MusicBand, PSH_Theatre_MusicBandOrg, PSH_Theatre_StandUpComedy, PSH_Theatre_StandUpComedyOrg, PSH_Organization

2. Services Classes for PSH_EnterCatag_TheatreService
3. UI for TheatreManagerRole and CustomerRole
4. Line Chart for rooms and cost



Ragamalika:

1. Classes for PSH_EnterCatag_Celebration, PSH_Celebration_Anniversary, PSH_Celebration_Bday, PSH_Celebration_Wedding, PSH_customer, PSH_customerDirectory, PSH_Manager, PSH_Person

2. Services Classes for PSH_EnterCatag_CelebrationService
3. UI for CelebrationManager Role and CelebrationAdmin Role
4. Bar chart for months and roombookings
